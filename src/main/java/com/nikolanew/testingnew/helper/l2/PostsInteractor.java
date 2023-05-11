package com.nikolanew.testingnew.helper.l2;

import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;

public class PostsInteractor {

    private final PostRepository postsRepository;
    private final UserRepository userRepository;

    PostsInteractor(
        PostRepository postsRepository,
        UserRepository userRepository
    ) {
        this.postsRepository = postsRepository;
        this.userRepository = userRepository;
    }

    Single<List<PostEntity>> getAllPosts() {

        List<PostEntity> postEntities = new ArrayList<>();
        postsRepository.getAll().doOnError(error -> {
            throw new RuntimeException(error.getMessage());
        }).subscribe(value -> {
            for (PostDto postEntity : value) {
                userRepository.getById(postEntity.getAuthorId()).subscribe((user) -> {
                    PostEntity newEntry = new PostEntity(user.getName(), postEntity.getContent());
                    postEntities.add(newEntry);
                });
            }
        });
        return Single.just(postEntities);
    }

}

interface UserRepository {

    Single<UserDto> getById(String userId);
}

interface PostRepository {

    Single<List<PostDto>> getAll();

}

class PostDto {

    private final String id;
    private final String authorId;
    private final String content;

    public PostDto(String id, String authorId, String content) {
        this.id = id;
        this.authorId = authorId;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public String getContent() {
        return content;
    }
}

class UserDto {

    private final String id;
    private final String name;

    public UserDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class PostEntity {

    private final String authorName;
    private final String content;

    public PostEntity(String authorName, String content) {
        this.authorName = authorName;
        this.content = content;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getContent() {
        return content;
    }
}
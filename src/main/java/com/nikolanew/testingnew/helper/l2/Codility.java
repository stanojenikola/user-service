package com.nikolanew.testingnew.helper.l2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Codility {

    public static void main(String[] args) {
        var a = "abc".strip().equals("");
        // Files.write();
    }

    public void saveStringInFile(String fileContents, String filename) throws Exception {
        Path file = Paths.get(filename);
        // Please implement the rest of this method using one of the methods of the Files class
        // The function should write the given string to the file with the given name
        Files.write(file, fileContents.getBytes(StandardCharsets.UTF_8));
    }
    Map<Long, Long> count(Map<String, UserStats>... visits) {
        if (visits == null) {
            return Collections.emptyMap();
        }

        Map<Long,Long> newMap = new HashMap<Long, Long>();

        if (visits.length > 0) {
            for (Map<String, UserStats> entry: visits) {
                if (entry == null) {
                    return Collections.emptyMap();
                }

                for (Map.Entry<String, UserStats> map: entry.entrySet()) {
                    if (map.getKey() != null && map.getValue() != null) {
                        if (map.getValue().getVisitCount().isPresent() && map.getKey().matches("\\d*")) {
                            newMap.put(Long.valueOf(map.getKey()), map.getValue().getVisitCount().get());
                        }
                    }
                }
            }
        }
        return newMap;
    }
}

class UserStats {
    Optional<Long> visitCount;


    public Optional<Long> getVisitCount() {
       return visitCount;
    }


}

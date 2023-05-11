package com.nikolanew.testingnew.helper;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

public class Reflection {

    public Reflection() {
        super();

        ApplicationContext applicationContext = new ApplicationContext() {
            @Override
            public Resource getResource(String location) {
                return null;
            }

            @Override
            public ClassLoader getClassLoader() {
                return null;
            }

            @Override
            public Resource[] getResources(String locationPattern) throws IOException {
                return new Resource[0];
            }

            @Override
            public Environment getEnvironment() {
                return null;
            }

            @Override
            public String getMessage(String code, Object[] args, String defaultMessage,
                Locale locale) {
                return null;
            }

            @Override
            public String getMessage(String code, Object[] args, Locale locale)
                throws NoSuchMessageException {
                return null;
            }

            @Override
            public String getMessage(MessageSourceResolvable resolvable, Locale locale)
                throws NoSuchMessageException {
                return null;
            }

            @Override
            public void publishEvent(Object event) {

            }

            @Override
            public Object getBean(String s) throws BeansException {
                return null;
            }

            @Override
            public <T> T getBean(String s, Class<T> aClass) throws BeansException {
                return null;
            }

            @Override
            public Object getBean(String s, Object... objects) throws BeansException {
                return null;
            }

            @Override
            public <T> T getBean(Class<T> aClass) throws BeansException {
                return null;
            }

            @Override
            public <T> T getBean(Class<T> aClass, Object... objects) throws BeansException {
                return null;
            }

            @Override
            public <T> ObjectProvider<T> getBeanProvider(Class<T> aClass) {
                return null;
            }

            @Override
            public <T> ObjectProvider<T> getBeanProvider(ResolvableType resolvableType) {
                return null;
            }

            @Override
            public boolean containsBean(String s) {
                return false;
            }

            @Override
            public boolean isSingleton(String s) throws NoSuchBeanDefinitionException {
                return false;
            }

            @Override
            public boolean isPrototype(String s) throws NoSuchBeanDefinitionException {
                return false;
            }

            @Override
            public boolean isTypeMatch(String s, ResolvableType resolvableType)
                throws NoSuchBeanDefinitionException {
                return false;
            }

            @Override
            public boolean isTypeMatch(String s, Class<?> aClass)
                throws NoSuchBeanDefinitionException {
                return false;
            }

            @Override
            public Class<?> getType(String s) throws NoSuchBeanDefinitionException {
                return null;
            }

            @Override
            public Class<?> getType(String s, boolean b) throws NoSuchBeanDefinitionException {
                return null;
            }

            @Override
            public String[] getAliases(String s) {
                return new String[0];
            }

            @Override
            public boolean containsBeanDefinition(String s) {
                return false;
            }

            @Override
            public int getBeanDefinitionCount() {
                return 0;
            }

            @Override
            public String[] getBeanDefinitionNames() {
                return new String[0];
            }

            @Override
            public <T> ObjectProvider<T> getBeanProvider(Class<T> aClass, boolean b) {
                return null;
            }

            @Override
            public <T> ObjectProvider<T> getBeanProvider(ResolvableType resolvableType, boolean b) {
                return null;
            }

            @Override
            public String[] getBeanNamesForType(ResolvableType resolvableType) {
                return new String[0];
            }

            @Override
            public String[] getBeanNamesForType(ResolvableType resolvableType, boolean b,
                boolean b1) {
                return new String[0];
            }

            @Override
            public String[] getBeanNamesForType(Class<?> aClass) {
                return new String[0];
            }

            @Override
            public String[] getBeanNamesForType(Class<?> aClass, boolean b, boolean b1) {
                return new String[0];
            }

            @Override
            public <T> Map<String, T> getBeansOfType(Class<T> aClass) throws BeansException {
                return null;
            }

            @Override
            public <T> Map<String, T> getBeansOfType(Class<T> aClass, boolean b, boolean b1)
                throws BeansException {
                return null;
            }

            @Override
            public String[] getBeanNamesForAnnotation(Class<? extends Annotation> aClass) {
                return new String[0];
            }

            @Override
            public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> aClass)
                throws BeansException {
                return null;
            }

            @Override
            public <A extends Annotation> A findAnnotationOnBean(String s, Class<A> aClass)
                throws NoSuchBeanDefinitionException {
                return null;
            }

            @Override
            public <A extends Annotation> A findAnnotationOnBean(String s, Class<A> aClass,
                boolean b) throws NoSuchBeanDefinitionException {
                return null;
            }

            @Override
            public BeanFactory getParentBeanFactory() {
                return null;
            }

            @Override
            public boolean containsLocalBean(String s) {
                return false;
            }

            @Override
            public String getId() {
                return null;
            }

            @Override
            public String getApplicationName() {
                return null;
            }

            @Override
            public String getDisplayName() {
                return null;
            }

            @Override
            public long getStartupDate() {
                return 0;
            }

            @Override
            public ApplicationContext getParent() {
                return null;
            }

            @Override
            public AutowireCapableBeanFactory getAutowireCapableBeanFactory()
                throws IllegalStateException {
                return null;
            }
        };
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Animals miniCat = new MiniCat();
        assertEquals(miniCat.getType(), "mini");

        Animals cat = new Cat();
        assertEquals(cat.getType(), "main cat");

        Animals animals = new Animals() {
            @Override
            public String lastName() {
                return null;
            }

            @Override
            public String dude() {
                return null;
            }

            @Override
            public String getType() {
                return "ani";
            }
        };

        Animals last = new Animals() {
            @Override
            public String dude() {
                return null;
            }

            @Override
            public String getType() {
                return null;
            }

            @Override
            public String lastName() {
                return null;
            }
        };

        assertEquals(animals.getType(), "ani");


        Object object = new Cat();
        Field[] fields = object.getClass().getDeclaredFields();
        int modifiers = object.getClass().getModifiers();
        Optional<Field> f = Optional.of(fields[0]);

        if (f.isPresent()) {
            System.out.println(f.get().getName());
        }

        System.out.println(Modifier.isPublic(modifiers));

    }
}

class MiniCat extends Cat {
    @Override
    public String getType() {
        return "mini";
    }
}

class Cat implements Animals {
    String name;

    @Override
    public String getType() {
        name = "nikola";
        return "main cat";
    }

    @Override
    public String dude() {
        return "d";
    }

    @Override
    public String lastName() {
        return null;
    }
}

interface Animals extends Extra  {
    String getType();
}

interface  Extra extends Last {
    String dude();
}

interface Last {
    String lastName();
}

package micsvc.consumer.movie.ribbon.entities;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  micsvc.provider.user.entities
 * Project Name:  SpringCloudMicSvcStudy
 * Author:  ZongxingH
 * Create Time:  2017/1/5 11:03
 */
public class User {

    private Long id;

    private String username;

    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

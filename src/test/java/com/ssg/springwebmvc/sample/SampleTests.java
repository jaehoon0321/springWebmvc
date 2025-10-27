package com.ssg.springwebmvc.sample;

import com.ssg.springwebmvc.Prof.ClassRoom;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;//주피터 api
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Component
@ExtendWith(SpringExtension.class)//Junit 버전에서 spring-test 이용하기 위한 설정 어노테이션
//spring의 설정 정보를 로딩하기 위한
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2


public class SampleTests {
    //스프링에서 사용하는 의존성 주입 어노테이션
    @Autowired
    private SampleService sampleService; //SampleService를 멤버 변수 선언
    //만일 지정된 빈이 존재한다면 이곳에 주입해 주기를 원해요~

    @Autowired
    private Restaurant restaurant;

    @Autowired
    private ClassRoom classRoom;


    @Test
    public void testSampleService() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }

    @Test
    public void testRestaruant() {
        log.info(restaurant);
        Assertions.assertNotNull(restaurant);
    }


    @Test
    public void testClassRoom() {
        log.info(classRoom);
        Assertions.assertNotNull(classRoom);
    }

}

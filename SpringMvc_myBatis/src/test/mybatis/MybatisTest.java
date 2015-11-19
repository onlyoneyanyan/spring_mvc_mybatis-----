package test.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.model.Area;
import demo.service.AreaServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class MybatisTest {

	private AreaServiceI areaService;

	@Autowired
	public void setAreaService(AreaServiceI areaService) {
		this.areaService = areaService;
	}

	@Test
	public void testGetArea() {
		System.out.println(areaService.getArea(1).getName());
	}

	@Test
	public void testAddArea() {
		Area area = new Area();
		area.setName("你好");
		area.setCityId(100);
		areaService.addArea(area);
	}
}

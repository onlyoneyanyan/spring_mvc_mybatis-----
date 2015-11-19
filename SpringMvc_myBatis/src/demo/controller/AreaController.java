package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.model.Area;
import demo.service.AreaServiceI;

@Controller
@RequestMapping("areaController")
public class AreaController
{

	private AreaServiceI areaService;

	@Autowired
	public void setAreaService(AreaServiceI areaService)
	{
		this.areaService = areaService;
	}

	@RequestMapping("/addArea")
	public String addArea(Area area)
	{
		try
		{	
			area.setCityId(Math.getExponent(3));
			areaService.addArea(area);
			return "success";
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return "error";
	}
}

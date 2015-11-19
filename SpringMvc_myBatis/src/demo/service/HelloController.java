package demo.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//����һ���ܺ�������Ǹ�ʲô�ģ�����ؾ��Ǹ���spring�������Controller 
@Controller
// ��һ���������������ַӳ���ע�⣬��������򷽷��ϡ��������ϣ���ʾ���е�������Ӧ����ķ��������Ըõ�ַ��Ϊ��·��
@RequestMapping("HelloController")
public class HelloController {

	// value�� ָ�������ʵ�ʵ�ַ��
	// method�� ָ�������method���ͣ� GET��POST��PUT��DELETE�ȣ�
	@RequestMapping(value = "/hello.json", method = RequestMethod.GET)
	// ��ע�����ڶ�ȡRequest�����body�������ݣ�ʹ��ϵͳĬ�����õ�HttpMessageConverter���н�����Ȼ�����Ӧ�����ݰ󶨵�Ҫ���صĶ����ϣ�
	@ResponseBody
	// ��ô����Ҫ���ʴ˷����� ����·��Ӧ����http://ip��ַ:�˿�/SpringMVC/HelloController/hello.json
	public Object hello() {
		return "Hello SpringMVC!";
	}
	
	@RequestMapping("test")
	public Object  test(){
		return "test success!";
	}
}

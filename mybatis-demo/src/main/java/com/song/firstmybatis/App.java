package com.song.firstmybatis;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;

import com.song.firstmybatis.mapper.EmpMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException
    {
        System.out.println( "Hello World!" );
        String resourcePath = "mybatis-config.xml";
        InputStream inputStream ;
		try {
			inputStream = Resources.getResourceAsStream(resourcePath);
	        SqlSessionFactory factory =new  SqlSessionFactoryBuilder().build(inputStream);
	        RowBounds bounds = new RowBounds(0, 3); 
	        SqlSession openSession = factory.openSession();
 			/* Map<Object, Object> selectMap = openSession.selectMap("t_map_exp_work_area.employee","empid");
 			Set<Object> keySet = selectMap.keySet();
 			Iterator<Object> iterator = keySet.iterator();
 			while(iterator.hasNext()) {
 				Object next = iterator.next();
 				System.out.println(next);
 			}*/
	        /*Map<String, String> map = new HashMap<String, String>();
	        map.put("EMP_NAME", "aaa");
	        openSession.insert("t_map_exp_work_area.addEmployee", map);*/
	       /* Long selectOne = openSession.selectOne("t_map_exp_work_area.sequence");
	        System.out.println(selectOne);
	        Long selectOne2 = openSession.selectOne("t_map_exp_work_area.sequence");
	        System.out.println(selectOne2);
	        Long selectOne3 = openSession.selectOne("t_map_exp_work_area.sequence");
	        System.out.println(selectOne3);*/
	       /* String param = "1";
	        Map map = new HashMap<String, String>();
	        map.put("param", "king");
	        List<Employee> selectList = openSession.selectList("t_map_exp_work_area.employee",map);
	        System.out.println(selectList.size());
	        Map map2 = new HashMap<String, String>();
	        map2.put("param", "jack");
	        List<Employee> selectList2 = openSession.selectList("t_map_exp_work_area.employee",map2);
	        System.out.println(selectList2.size());
	        Map map3 = new HashMap<String, Integer>();
	        map3.put("param", 2);
	        List<Employee> selectList3 = openSession.selectList("t_map_exp_work_area.employeee",map3);
	        System.out.println(selectList3.size());*/
	        List<DEPT> selectList = openSession.selectList("work.getDept");
	        for(DEPT dept:selectList) {
	        	System.out.println(dept);
	        }
	      /*  EmpMapper mapper = openSession.getMapper(EmpMapper.class);
	        Emp emp = mapper.getEmp();
	        System.out.println(emp.toString());*/
		} catch (IOException e) {
			e.printStackTrace();
		}
   
    }
}

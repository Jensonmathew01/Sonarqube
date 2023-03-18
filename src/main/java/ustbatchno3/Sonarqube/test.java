Java8 program to increment salary based on experience.
*****************************************************
package ustbatchno3.Sonarqube;
import java.util.*;
import java.util.stream.Collectors;
public class test {

	public static void main(String[] args) {
     List<emp> e=new ArrayList<emp>();
     e.add(new emp("James",26,2,40000));
     e.add(new emp("Jacob",34,5,60000));
     e.add(new emp("Joel",35,10,55000));
     System.out.println(e);
     List<emp> a= e.stream().peek(t->{ double salary=t.getSalary();
     if(t.getN()>=1 && t.getN()<3) {
  	   t.setSalary(salary*1.025);
     }
     else if(t.getN()>=3 && t.getN()<6) {
  	   t.setSalary(salary*1.05);
     }
  	 else if(t.getN()>=6 && t.getN()<10) {
    	   t.setSalary(salary*1.1);
    	   }
  	else if(t.getN()>=10) {
   	   t.setSalary(salary*1.12);
     }}).collect(Collectors.toList());
     System.out.println(a);
	}
	

}

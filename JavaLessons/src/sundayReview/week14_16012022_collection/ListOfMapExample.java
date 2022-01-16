package sundayReview.week14_16012022_collection;

import java.util.*;

public class ListOfMapExample {

    public static void main(String[] args) {

        Map<String,String> empOneData= new HashMap<>(); // HashMap does not keep order // {Salary=100_000, EmpID=123, JobTitle=SDET, EmpName=John}

        empOneData.put("EmpID","123");
        empOneData.put("EmpName","John");
        empOneData.put("JobTitle","SDET");
        empOneData.put("Salary","100_000");

        System.out.println(empOneData);

        Map<String,String> empOneData2= new LinkedHashMap<>(); // keep order //{EmpID=123, EmpName=John, JobTitle=SDET, Salary=100_000}
        empOneData2.put("EmpID","123");
        empOneData2.put("EmpName","John");
        empOneData2.put("JobTitle","SDET");
        empOneData2.put("Salary","100_000");

        System.out.println(empOneData2);

        Map<String,String> empTwoData2= new LinkedHashMap<>();
        empTwoData2.put("EmpID","124");
        empTwoData2.put("EmpName","Mike");
        empTwoData2.put("JobTitle","Developer");
        empTwoData2.put("Salary","120_000");

        System.out.println(empTwoData2);

        System.out.println("Mike's salary = " + empTwoData2.get("Salary"));
        System.out.println(empTwoData2.get("EmpName") + " = " + empTwoData2.get("Salary"));

        List<Map<String,String>> employeesList= new ArrayList<>();
        employeesList.add(empOneData2);
        employeesList.add(empTwoData2);
        System.out.println("employeesList = " + employeesList);

        for(Map<String,String> emp: employeesList){
            if(emp.get("EmpName").equals("Mike")){
                System.out.println(emp.get("EmpName")+ ": " +emp.get("Salary"));
            }
        }




    }

}

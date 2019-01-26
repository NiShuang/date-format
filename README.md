### Useage
````
System.out.println(DateUtil.parseDate("11 August 2018"));
System.out.println(DateUtil.parseDate("October 27, 2018"));
System.out.println(DateUtil.parseDate("2018年10月24日"));
System.out.println(DateUtil.parseDate("19 de octubre de 2018"));
System.out.println(DateUtil.parseDate("5 octobre 2018"));
System.out.println(DateUtil.parseDate("22. Oktober 2018"));
System.out.println(DateUtil.parseDate("2 ottobre 2018"));
````

````
2018-10-27
2018-10-24
2018-10-19
2018-10-5
2018-10-22
2018-10-2
````
# nacha-templates-testing
Repository for creating nacha sample files for testing purposes .  Static templates are parameterized so that we can substitute parameters and use them for testing.

## Apache freemarker 
we will use static files for nacha templates . templates would be parameterized using freemarker syntax . It would be substituted using parameters given in properties file. You can find more information on the apache freemarker on https://freemarker.apache.org/

## How to use the repository
1. Look at the test cases to see usage
2. **generateNachaFile** test case will generate a ach file using nacha_customer_CT_PPD.ftl
3. There is one variable ${nachaConfig.effDate} that would get substituted with actual value

## Set up /Changes 
All freemarker templates needs to be put in resources directory 
Change the ResourcePath.basePath variable to point to the location of your templates.

## Before
![image](https://github.com/tanmaypatil/nacha-templates-testing/assets/5380383/b48b3015-1066-4fe2-bf71-fa56c0ce7605)



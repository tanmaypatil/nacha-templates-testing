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

## freemarker template for Nacha CT
![image](https://github.com/tanmaypatil/nacha-templates-testing/assets/5380383/322ab5b7-0180-4a84-96a5-17b1afa9c1ec)

## Nacha file generated 
You can observe that effDate variable is replaced in generated file.
![image](https://github.com/tanmaypatil/nacha-templates-testing/assets/5380383/79d9ad58-3824-4ae0-baa2-e32e0d36b659)



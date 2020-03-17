![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Project Builder | Blog - Stage 3 (Create and Display Blog)

Remember your client Mr. Alex? 

Well, he loves your work and is back for your help. He's reworking on the same project with the help of databases. Can you look into his requirements & sort things out?
You can start building the project on top of Stage - 2

## What Should You Do
```
Fork this repo
Clone this repo
Practice Java JDBC - connections, Statement and ResultSet.
```

## How To Submit
```
Upon completion, run the following commands:

git add .
git commit -m "ProGrad ID"
git push origin master

And finally, create a pull request so your ProGrad Mentor (PM) can review your work.
```

## Instructions

1. ***Do not modify the entire code.***
2. ***Edit the code as per the instructions.***
3. ***Go to Java Resources -> src folder.***
4. ***Your database connection code should exist inside the utlity package.***
5. ***Your crud operations should go inside the dao package.***
7. ***Create the connection object in the controller and call the respective methods.***
6. ***Once the progressions are completed follow the instructions to run the application and test your code.***
7. ***Add appropriate jars to your project directory.***



## Requirements
Download ojdbc6.jar from the given link [https://www.oracle.com/database/technologies/jdbcdriver-ucp-downloads.html]

## Progression 0:
1. **Right click on src folder and select new - file and name it as jdbc.properties.**
2. **You can use the jdbc properties given below in the NOTE section.**

## Progression 1:
1. **Create a class called as `ConnectionManager` inside the utility package.**
2. **Create a method public static Connection getConnection() which returns a connection object.**
3. **Use the method public static Properties loadPropertiesFile() to load the jdbc properties from the jdbc.properties file.**

## Progression 2:
1. **Create a model class called as `Blog' inside the model package with the following arguments,**
    - int blogId
	  - String blogTitle;
	  - String blogDescription;
	  - LocalDate postedOn;
2. **Include appropriate getters and setters method.**

## Progression 3:
1. **Create an interface called BlogDaoInterface inside the dao package with the following methods,**
     - void insertBlog(Blog blog)
     - List<Blog> selectAllBlogs()

## Progression 4:
1. **Create a dao-class called BlogDaoImpl inside the dao package.**
2. **It should implement the BlogDaoInterface.**
3. **Implement the following methods,**
      - void insertBlog(Blog blog) - method to insert the blog into the database.
      - List<Blog> selectAllBlogs() - method to retrieve the blogs from the database.

## Progression 4:
1. **Go to src/controller - AddNewBlogController.**
2. **Create objects for the Blog and BlogDaoImpl class.**
3. **Call the insertBlog methods and pass Blog as argument to insertBlog.**
4. **Go to database and check if your blog is successfully inserted.**

## Progression 5:
1. **Go to src/controller - ViewAllBlogController.**
2. **Create object BlogDaoImpl class.**
3. **Call the selectAllBlogs methods and store the return value in a list variable called as listBlog.**
4. **Your output is the list of blogs stored in the database.**

### Note:

Use the below code to retreive the connection details from jdbc.properties to establish connection
```
public static Properties loadPropertiesFile() throws Exception {
	Properties prop = new Properties();	
	InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	prop.load(in);
	in.close(); 
	return prop;
}
```
Create a file called as jdbc.properites. To create a file right click on the application - new - file - name the file as jdbc.properties.
```
jdbc.properties
#JDBC properties entry for ORACLE server
driver = oracle.jdbc.OracleDriver
url=jdbc:oracle:thin:@localhost:1521:xe
username=your_username
password=your_password

```
  

Project 2-Programming 2 CS272

Restaurant System:

@Authors:
	Ahmed Osama ElShafaay-6078
	Omar Mohamed Samir-6290

@Libraries Used:
	Simple Framework-XML Binder
	Swing Framework
@Brief:
	The Simple framework was used to parse the data from the Given Xml file as first run data and 
	written to another Xml file that represents our own class structure and design.On following
	successive runs the generated file is read and its contents are loaded to memory for operation.

@Program Layout:
	On clicking the Self-Executable Jar file,the User is greeted to the Login Page where they can enter their
	credentials.The user is navigated to the dashboard that matches his account.
	A Customer is permitted to:
	>Choose a table according to the number of chairs he need and whether he chooses a smoking or non-smoking area
	>Then,the customer chooses from the available dishes in the restaurant.
	>Finally,the order details,contents and price, are presented to the user so he can confirm his order or discard it.

	A Cook is permitted to:
	>See uncooked orders so he can be able to prepare them
	>When he finishes preparing the order,he updates the status of it to be served by the waiter.

	A Waiter is permitted to:
	>See the tables of the restaruant ,whether available or reserved to a customer.
	>If a table is reserved , the waiter can see the client name and his order details,if the order is cooked the waiter can serve it.Then
	the it is added to restaurant's revenue.

	A Manager is permitted to:
	>See the tables of the restaurant and their details.
	>Check all orders for today,including dishes,price and customer.
	>Check the total revenue for the restaurant today.
	>Add users for the restaurant system,modify existing accounts or removing them.
	>Add Dishes to the menu by specifying the name,type and price.He can also remove existing ones.

@Graphical Windows:
	>Login Form
	>Manager Dashboard
	>Customer Dashboard
	>Waiter Dashboard
	>Cook Dashboard
	Hash Maps were critical to the project so that Data could be linked to the appropriate graphical elements.

@Delievered Files:
	-input.xml--->contains the xml provided by teaching staff.
	-Self-Executable , self contained Jar--->The Jar is to be placed in the same folder as 'input.xml'.
	-Program source code in Java under ./src/Kitchen
	-Compiled class files under ./out/production/Restaurant/Kitchen
	-Simple Framework jar under ./lib
	-Absolute Layout jar under ./lib
	-UML diagrams under ./RestaurantUML

@Labor Division:
	-UML --Ahmed,Omar
	-Login--Ahmed
	-Client Form-Ahmed
	-Cook Form-Ahmed
	-Waiter Form-Omar
	-Manager Form-Omar,Ahmed
	-XML Parsing-Omar
	-UI Enhacements-Ahmed
	-AppDeployment-Omar
	
	

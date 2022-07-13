Feature: Product Store 
	Como usuario quiero registrarme y despues loguearme para comprar una laptop
	
	Scenario: Ingresar a la opción de Sign Up desde la pantalla home
	Given Click en el link Sing Up
	When El Usuario Captura Username, Password y da Click en el boton Sing Up 
	Then Usuario registrado correctamente
	
	Scenario: Ingresar a la opción Log In desde la pantalla home
	Given Click en el Link Log In Usuario 
	When El usuario captura credenciales validas username, password y da click en el boton login
	And Usuario loguado correctamente
	And Seleccionar la opcion Laptops
	And Seleccionar el primer resultado de la lista
	And En la nueva ventana dar click en agregar al carrito
	And Ingresar a el Link Cart para validar  
	Then Click en el link Log out

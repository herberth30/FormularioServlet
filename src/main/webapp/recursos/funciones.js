function validarForma(forma) {
    var usuario = forma.usuario;
    if (usuario.value == "" || usuario.value=="Escribir usuario") {
      alert("El campo usuario no puede estar vacío");
      usuario.focus();
      usuario.select();
      return false;
    }
    var password = forma.password;
    if (password.value == "" || password.value=="Escribir password") {
      alert("El campo contraseña no puede estar vacío");
       password.focus();
       password.select();
      return false;
    }
    var tecnologias = forma.tecnologias;
    var checkSeleccionado = false;
    
    for(var i=0;i<tecnologias.length;i++){
        if(tecnologias[i].checked){
            checkSeleccionado=true;
        }
    }
    
    if (!checkSeleccionado){
        alert("Seleccioe una tecnologia ");
        return false;
    }
    
  }

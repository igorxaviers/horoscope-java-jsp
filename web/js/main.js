$("#login-form").submit(function() {
  if($("#Email").val()== null || $("#Email").val() =="" || $("#Password").val()== null || $("#Password").val() == ""){
      alert('campo vazio');      
      return false;
  }
});

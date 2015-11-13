<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Inserir m�dulo</title>
	<link rel="stylesheet" type="text/css" href="estilo.css">
</head>

<body>

    <div id="signup-form">
        <div id="signup-inner">
        	<div class="clearfix" id="header">
        		<img id="signup-icon" src="./images/signup.png" alt="" />
        
                <h1>Boas vindas!</h1>
            </div>
			<p>Para cadastrar m�dulo, escolha op��o abaixo:</p>

            
            <form action='CadastraLivro' method='post'>

                <label for="titulo">T�tulo</label>
                <input id="titulo" type="text" name="titulo" value="" />
                </p>
                
                <p>
                <label for="autores">Autores</label>
                <input id="autores" type="text" name="autores" value="" />
                </p>
                
                <p>
                <label for="descr">Breve Descri��o</label>
                <textarea name="descr" id="descr" cols="30" rows="10"></textarea>
                </p>
                   
                <p>
                <select name='tipo' id='tipo'>
					<option>Livro</option>
					<option>Peri�dico</option>
					<option>Fotografia</option>
					<option>�udio</option>
				</select>
				
                <p>
                <label for="paginas">N�mero de p�ginas</label>
                <input id="paginas" type="text" name="paginas" value="" />
                </p>
                
                <p>
                <label for="ano">Ano de publica��o</label>
                <input id="ano" type="text" name="ano" value="" />
                </p>
                
                <p>
                <label for="editora">Editora</label>
                <input id="editora" type="text" name="editora" value="" />
                </p>
                <button id="submit" type="submit">Submit</button>
                </p>
                
            </form>
           </div>
        </div>
    </div>

</body>
</html>

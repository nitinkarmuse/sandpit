<html>
    <head>
        <title><g:layoutTitle default="An example decorator" /></title>
        <g:layoutHead />
    </head>
    <body onload="${pageProperty(name:'body.onload')}">
        <div class="menu">layout menu</menu>
            <div class="body">
                <g:layoutBody />
            </div>
        </div>
    </body>
</html>
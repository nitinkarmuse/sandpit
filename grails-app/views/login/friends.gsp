<html>
    <head>
        <title>Login</title>
        <meta name="layout" content="mylayout" />
    </head>
    <body>
      ${user.id}<br/>
      ${user.name} <br/>
      ${user.fbId}
      <g:link action="create" controller="emote" >Create emote</g:link>
      <br/>
      <g:form action="search" controller="emote">
      	Search by Topic: <g:textField name="topic"/>
      	<g:submitButton name="search"/>
      </g:form>

    </body>
</html>
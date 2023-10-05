package com.example

import com.example.dto.User
import groovy.transform.CompileStatic
import io.micronaut.http.HttpStatus

@SuppressWarnings(['ClassJavadoc'])
@CompileStatic
class IndexController {

//    @Autowired  - não precisa na versão 6 do grails
    final UsersClient usersClient

    IndexController(UsersClient usersClient) {
        this.usersClient = usersClient
    }

    def index() {
        render 'teste3'
    }

    def users() {
        List<User> all = usersClient.all
        //render all as JSON
        respond(all, formats: ['json'], status: HttpStatus.OK.code)
    }

}

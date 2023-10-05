package com.example

import com.example.dto.User
import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@SuppressWarnings('ClassJavadoc')
@CompileStatic
@Client('${meucliente.url}')
interface UsersClient {

    @Get('users')
    List<User> getAll()

}

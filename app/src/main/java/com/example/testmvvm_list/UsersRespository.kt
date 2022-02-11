package com.example.testmvvm_list

class UsersRespository(
    private val api :ApiService
):SafeApiRequest() {
suspend fun getUsers()=apiRequest { api.getAllUsers() }
}
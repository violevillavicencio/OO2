package io.github.unlp_oo.archetype;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess {
    private DatabaseRealAccess database;
    private boolean autenticado;
    private String pass; 

    public DatabaseProxy(DatabaseRealAccess database) {
        this.database = database;
        this.autenticado = false;
        this.pass = "123"; 
    }

    public void login(String password) {
        if (password.equals(pass)) {
            this.autenticado = true;
        }
    }

    public void logout() {
        this.autenticado = false;
    }

    private void verificarAcceso() {
        if (!autenticado) {
            throw new RuntimeException("Acceso denegado. Usuario no autenticado.");
        }
    }
    
    @Override
    public Collection<String> getSearchResults(String queryString) {
    	this.verificarAcceso();
        return database.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
    	this.verificarAcceso();
        return database.insertNewRow(rowData);
    }   
    
}

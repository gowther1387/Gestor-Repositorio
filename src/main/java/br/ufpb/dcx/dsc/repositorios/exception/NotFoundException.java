package br.ufpb.dcx.dsc.repositorios.exception;

public class NotFoundException extends RuntimeException {
        public NotFoundException(String message) {
            super(message);
        }
}
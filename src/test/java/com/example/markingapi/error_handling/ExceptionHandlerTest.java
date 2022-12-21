package com.example.markingapi.error_handling;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;

import java.security.Principal;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlerTest {

    private final Exception ex = new Exception();
    private final WebRequest request = new WebRequest() {
        @Override
        public String getHeader(String headerName) {
            return null;
        }

        @Override
        public String[] getHeaderValues(String headerName) {
            return new String[0];
        }

        @Override
        public Iterator<String> getHeaderNames() {
            return null;
        }

        @Override
        public String getParameter(String paramName) {
            return null;
        }

        @Override
        public String[] getParameterValues(String paramName) {
            return new String[0];
        }

        @Override
        public Iterator<String> getParameterNames() {
            return null;
        }

        @Override
        public Map<String, String[]> getParameterMap() {
            return null;
        }

        @Override
        public Locale getLocale() {
            return null;
        }

        @Override
        public String getContextPath() {
            return null;
        }

        @Override
        public String getRemoteUser() {
            return null;
        }

        @Override
        public Principal getUserPrincipal() {
            return null;
        }

        @Override
        public boolean isUserInRole(String role) {
            return false;
        }

        @Override
        public boolean isSecure() {
            return false;
        }

        @Override
        public boolean checkNotModified(long lastModifiedTimestamp) {
            return false;
        }

        @Override
        public boolean checkNotModified(String etag) {
            return false;
        }

        @Override
        public boolean checkNotModified(String etag, long lastModifiedTimestamp) {
            return false;
        }

        @Override
        public String getDescription(boolean includeClientInfo) {
            return null;
        }

        @Override
        public Object getAttribute(String name, int scope) {
            return null;
        }

        @Override
        public void setAttribute(String name, Object value, int scope) {

        }

        @Override
        public void removeAttribute(String name, int scope) {

        }

        @Override
        public String[] getAttributeNames(int scope) {
            return new String[0];
        }

        @Override
        public void registerDestructionCallback(String name, Runnable callback, int scope) {

        }

        @Override
        public Object resolveReference(String key) {
            return null;
        }

        @Override
        public String getSessionId() {
            return null;
        }

        @Override
        public Object getSessionMutex() {
            return null;
        }
    };

    @Test
    void handleAllExceptions() {
        ExceptionHandler handler = new ExceptionHandler();
        Error_Details errorDetails = new Error_Details(new Date(), ex.getMessage(),
                request.getDescription(false));
        ResponseEntity<Error_Details> expected = new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
        ResponseEntity<Error_Details> response = handler.handleAllExceptions(ex, request);
        assertNotEquals(expected, response);
    }
}
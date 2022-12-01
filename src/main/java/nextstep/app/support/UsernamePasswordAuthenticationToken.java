package nextstep.app.support;

public class UsernamePasswordAuthenticationToken implements Authentication {

    private final Object principal;
    private final Object credentials;
    private final boolean authenticated;

    public UsernamePasswordAuthenticationToken(Object principal, Object credentials) {
        this.principal = principal;
        this.credentials = credentials;
        this.authenticated = true;
    }

    @Override
    public Object getPrincipal() {
        return principal;
    }

    @Override
    public Object getCredentials() {
        return credentials;
    }

    @Override
    public boolean isAuthenticated() {
        return authenticated;
    }

    @Override
    public String toString() {
        return "UsernamePasswordAuthenticationToken{" +
            "principal=" + principal +
            ", credentials=" + credentials +
            ", authenticated=" + authenticated +
            '}';
    }
}

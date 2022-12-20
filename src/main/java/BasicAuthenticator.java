import org.wso2.carbon.identity.application.authentication.framework.AbstractApplicationAuthenticator;
import org.wso2.carbon.identity.application.authentication.framework.ApplicationAuthenticator;
import org.wso2.carbon.identity.application.authentication.framework.AuthenticatorFlowStatus;
import org.wso2.carbon.identity.application.authentication.framework.context.AuthenticationContext;
import org.wso2.carbon.identity.application.authentication.framework.exception.AuthenticationFailedException;
import org.wso2.carbon.identity.application.authentication.framework.exception.LogoutFailedException;
import org.wso2.carbon.identity.application.common.model.Property;
import org.wso2.carbon.user.api.Claim;
import org.wso2.carbon.user.api.ClaimManager;
import org.wso2.carbon.user.api.Permission;
import org.wso2.carbon.user.api.Properties;
import org.wso2.carbon.user.api.Tenant;
import org.wso2.carbon.user.api.UserStoreException;
import org.wso2.carbon.user.api.UserStoreManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.Map;

class myClass {

    private int number;
    private static final long serialVersionUID = 123;
}

class Registry implements UserStoreManager {

    // A bug should be detected on the next line as class level variables should not be allowed.
    private int number;
    private static final long serialVersionUID = 123;

    public boolean authenticate(String s, Object o) throws UserStoreException {
        return false;
    }

    @Override
    public String[] listUsers(String s, int i) throws UserStoreException {

        return new String[0];
    }

    @Override
    public boolean isExistingUser(String s) throws UserStoreException {

        return false;
    }

    @Override
    public boolean isExistingRole(String s, boolean b) throws UserStoreException {

        return false;
    }

    @Override
    public boolean isExistingRole(String s) throws UserStoreException {

        return false;
    }

    @Override
    public String[] getRoleNames() throws UserStoreException {

        return new String[0];
    }

    @Override
    public String[] getProfileNames(String s) throws UserStoreException {

        return new String[0];
    }

    @Override
    public String[] getRoleListOfUser(String s) throws UserStoreException {

        return new String[0];
    }

    @Override
    public String[] getUserListOfRole(String s) throws UserStoreException {

        return new String[0];
    }

    @Override
    public String getUserClaimValue(String s, String s1, String s2) throws UserStoreException {

        return null;
    }

    @Override
    public Map<String, String> getUserClaimValues(String s, String[] strings, String s1) throws UserStoreException {

        return null;
    }

    @Override
    public Claim[] getUserClaimValues(String s, String s1) throws UserStoreException {

        return new Claim[0];
    }

    @Override
    public String[] getAllProfileNames() throws UserStoreException {

        return new String[0];
    }

    @Override
    public boolean isReadOnly() throws UserStoreException {

        return false;
    }

    @Override
    public void addUser(String s, Object o, String[] strings, Map<String, String> map, String s1) throws UserStoreException {

    }

    @Override
    public void addUser(String s, Object o, String[] strings, Map<String, String> map, String s1, boolean b) throws UserStoreException {

    }

    @Override
    public void updateCredential(String s, Object o, Object o1) throws UserStoreException {

    }

    @Override
    public void updateCredentialByAdmin(String s, Object o) throws UserStoreException {

    }

    @Override
    public void deleteUser(String s) throws UserStoreException {

    }

    @Override
    public void addRole(String s, String[] strings, Permission[] permissions, boolean b) throws UserStoreException {

    }

    @Override
    public void addRole(String s, String[] strings, Permission[] permissions) throws UserStoreException {

    }

    @Override
    public void deleteRole(String s) throws UserStoreException {

    }

    @Override
    public void updateUserListOfRole(String s, String[] strings, String[] strings1) throws UserStoreException {

    }

    @Override
    public void updateRoleListOfUser(String s, String[] strings, String[] strings1) throws UserStoreException {

    }

    @Override
    public void setUserClaimValue(String s, String s1, String s2, String s3) throws UserStoreException {

    }

    @Override
    public void setUserClaimValues(String s, Map<String, String> map, String s1) throws UserStoreException {

    }

    @Override
    public void deleteUserClaimValue(String s, String s1, String s2) throws UserStoreException {

    }

    @Override
    public void deleteUserClaimValues(String s, String[] strings, String s1) throws UserStoreException {

    }

    @Override
    public String[] getHybridRoles() throws UserStoreException {

        return new String[0];
    }

    @Override
    public Date getPasswordExpirationTime(String s) throws UserStoreException {

        return null;
    }

    @Override
    public int getUserId(String s) throws UserStoreException {

        return 0;
    }

    @Override
    public int getTenantId(String s) throws UserStoreException {

        return 0;
    }

    @Override
    public int getTenantId() throws UserStoreException {

        return 0;
    }

    @Override
    public Map<String, String> getProperties(Tenant tenant) throws UserStoreException {

        return null;
    }

    @Override
    public void updateRoleName(String s, String s1) throws UserStoreException {

    }

    @Override
    public boolean isMultipleProfilesAllowed() {

        return false;
    }

    @Override
    public void addRememberMe(String s, String s1) throws UserStoreException {

    }

    @Override
    public boolean isValidRememberMeToken(String s, String s1) throws UserStoreException {

        return false;
    }

    @Override
    public ClaimManager getClaimManager() throws UserStoreException {

        return null;
    }

    @Override
    public boolean isSCIMEnabled() throws UserStoreException {

        return false;
    }

    @Override
    public Properties getDefaultUserStoreProperties() {

        return null;
    }
}

class BasicAuthenticator extends AbstractApplicationAuthenticator {

    private int number;
    private static final long serialVersionUID = 123;

    @Override
    protected void processAuthenticationResponse(HttpServletRequest request, HttpServletResponse response, AuthenticationContext context) throws AuthenticationFailedException {

    }

    @Override
    public boolean canHandle(HttpServletRequest request) {

        return false;
    }

    @Override
    public String getContextIdentifier(HttpServletRequest request) {

        return null;
    }

    @Override
    public String getName() {

        return null;
    }

    @Override
    public String getFriendlyName() {

        return null;
    }
}

class FederatedAuthenticator implements ApplicationAuthenticator {

    private int number;
    private static final long serialVersionUID = 123;

    @Override
    public boolean canHandle(HttpServletRequest request) {

        return false;
    }

    @Override
    public AuthenticatorFlowStatus process(HttpServletRequest request, HttpServletResponse response, AuthenticationContext context) throws AuthenticationFailedException, LogoutFailedException {

        return null;
    }

    @Override
    public String getContextIdentifier(HttpServletRequest request) {

        return null;
    }

    @Override
    public String getName() {

        return null;
    }

    @Override
    public String getFriendlyName() {

        return null;
    }

    @Override
    public String getClaimDialectURI() {

        return null;
    }

    @Override
    public List<Property> getConfigurationProperties() {

        return null;
    }
}

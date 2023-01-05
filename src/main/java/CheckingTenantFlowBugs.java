public class CheckingTenantFlowBugs {

    class testingTenantFlow {

        int num;
    
        void startTenantFlow(){
            // Do nothing.
        }
    
        void endTenantFlow(){
            // Do nothing.
        }
    
        void mainMethod() {
    
            // Tenant flow not inside a try, so bug should be reported.
            startTenantFlow(); 
            endTenantFlow(); 
    
            try {
                startTenantFlow();
                int i;
    
    
            } catch(Exception e) {
    
            } finally {
                endTenantFlow();
            }
    
            // End tenant flow should be in finally so bug and can not be called inside catch as well.
            try {
                endTenantFlow(); 
    
            } catch(Exception e) {
                startTenantFlow(); 
                endTenantFlow(); 
    
            } finally {
                endTenantFlow();
            }
    
        }
    
        // startTenantFlow should not be called again in catch.
        void anotherMethod() {
    
            try {
                startTenantFlow();
                int i;
    
            } catch(Exception e) {
                startTenantFlow(); 
    
            } finally {
                endTenantFlow();
            }

            // startTenantFlow not the first line in a try block.
    
            try {
                String myString;
                int myNum;
                startTenantFlow();
    
            } catch(Exception e) {
    
            } finally {
                endTenantFlow();
            }
    
        }
    
    
    }
    
    
}

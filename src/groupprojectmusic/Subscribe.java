/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupprojectmusic;

/**
 *
 * @author user
 */
abstract class subscriptionPackage {
    abstract void typeSubscription();
    
}
class AbsMusic extends subscriptionPackage{
    void typeSubscription(){
        System.out.println("Subscription package available: "+"\n1. Basic"+"\n2. Student"+"\n3. Premium");
    }    
}

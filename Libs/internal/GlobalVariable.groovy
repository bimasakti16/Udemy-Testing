package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object level_all
     
    /**
     * <p></p>
     */
    public static Object level_beginner
     
    /**
     * <p></p>
     */
    public static Object level_intermediate
     
    /**
     * <p></p>
     */
    public static Object level_expert
     
    /**
     * <p></p>
     */
    public static Object lang_english
     
    /**
     * <p></p>
     */
    public static Object lang_port
     
    /**
     * <p></p>
     */
    public static Object lang_esp
     
    /**
     * <p></p>
     */
    public static Object dura_0_2h
     
    /**
     * <p></p>
     */
    public static Object dura_3_6h
     
    /**
     * <p></p>
     */
    public static Object dura_7_16h
     
    /**
     * <p></p>
     */
    public static Object dura_17h
     
    /**
     * <p></p>
     */
    public static Object price_free
     
    /**
     * <p></p>
     */
    public static Object price_paid
     
    /**
     * <p></p>
     */
    public static Object rating_45_up
     
    /**
     * <p></p>
     */
    public static Object rating_40_up
     
    /**
     * <p></p>
     */
    public static Object rating_35_up
     
    /**
     * <p></p>
     */
    public static Object rating_30_up
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            level_all = selectedVariables['level_all']
            level_beginner = selectedVariables['level_beginner']
            level_intermediate = selectedVariables['level_intermediate']
            level_expert = selectedVariables['level_expert']
            lang_english = selectedVariables['lang_english']
            lang_port = selectedVariables['lang_port']
            lang_esp = selectedVariables['lang_esp']
            dura_0_2h = selectedVariables['dura_0_2h']
            dura_3_6h = selectedVariables['dura_3_6h']
            dura_7_16h = selectedVariables['dura_7_16h']
            dura_17h = selectedVariables['dura_17h']
            price_free = selectedVariables['price_free']
            price_paid = selectedVariables['price_paid']
            rating_45_up = selectedVariables['rating_45_up']
            rating_40_up = selectedVariables['rating_40_up']
            rating_35_up = selectedVariables['rating_35_up']
            rating_30_up = selectedVariables['rating_30_up']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

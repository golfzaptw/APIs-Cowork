package internal
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import groovy.transform.CompileStatic


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 * 
 */

@CompileStatic
public class GlobalVariable {
	 
    /**
     * <p></p>
     */
	public static Object server = 'https://api-co-work.herokuapp.com/'
	 
    /**
     * <p></p>
     */
	public static Object list_response = ['success', 'data', '_id', 'name', 'rarting', 'address', 'gellery', 'status']
	 
    /**
     * <p></p>
     */
	public static Object emailLogin_response = ['success', 'data', 'id', 'name', 'email', 'status', 'image']
	 
    /**
     * <p></p>
     */
	public static Object fbLogin_response = ['success', 'data', '_id', 'name', 'email', 'password', 'image', 'status', 'facebook_id']
	 
    /**
     * <p></p>
     */
	public static Object adminLogin_response = ['success', 'data', '_id', 'email', 'password', 'role']
	 
}

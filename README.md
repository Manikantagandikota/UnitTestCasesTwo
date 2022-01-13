# UnitTestCasesTwo
TestCases
Unit Testing is done to ensure that the developer would be unable to write low quality/erroneous code. It makes sense to write Unit Tests before writing the actual app as then you wouldn’t have a bias towards the success of your tests

Junit It is a “Unit Testing” framework for Java Applications. It is an automation framework for Unit as well as UI Testing. It contains annotations such as @Test, @Before, @After etc.
@Test: @Test is an annotation provided by JUnit Framework for marking a method as a test case. As you can see here, each method is a test case testing the input field for a possible input. This instructs the compiler to consider the method as a test case in the test suit.
assertTrue(): assertTrue is a method provided by Junit Framework to assert (force) the value inside it’s parentheses as TRUE. If the value inside the parentheses evaluates to be false, the test case fails.
assertFalse(): Same as the assertTrue method except that it asserts the argument inside the parentheses to be false instead of true. If the passed parameter is true, the test case fails.
@Before
Several tests need similar objects created before they can run. Annotating a public void method with @Before causes that method to be run before each Test method.
@After
If you allocate external resources in a Before method, you need to release them after the test runs. Annotating a public void method with @After causes that method to be run after the Test method.
@BeforeClass
Annotating a public static void method with @BeforeClass causes it to be run once before any of the test methods in the class.
@AfterClass
This will perform the method after all tests have finished. This can be used to perform clean-up activities.


Dependencies
testImplementation 'junit:junit:4.12'

@Test
public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
    assertTrue(EmailValidator.isValidEmail("name@email.com"));
}

@Test
public void emailValidator_InvalidEmailNoTld_ReturnsFalse() {
assertFalse(EmailValidator.isValidEmail("name@email"));
}







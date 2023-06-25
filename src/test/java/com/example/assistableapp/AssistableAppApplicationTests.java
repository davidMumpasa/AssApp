 package com.example.assistableapp;


// import com.example.assistableapp.bussinessLogic.AccountService;
// import com.example.assistableapp.entities.BankAccountVerificationRequest;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.springframework.http.*;
// import org.springframework.util.LinkedMultiValueMap;
// import org.springframework.util.MultiValueMap;
// import org.springframework.web.client.RestTemplate;

 import org.springframework.boot.test.context.SpringBootTest;

 // import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.ArgumentMatchers.anyString;
// import static org.mockito.ArgumentMatchers.eq;
// import static org.mockito.Mockito.*;
 @SpringBootTest
 class AssistableAppApplicationTests {

// 	@Mock
// 	RestTemplate restTemplate;
// 	@InjectMocks
// 	private AccountService accountService;

// 	    @BeforeEach
//     void setUp() {
//         MockitoAnnotations.initMocks(this);
//     }


// 	@Test
// 	void contextLoads() {
// 		 //Mocking the getRequestParameters() method

//         BankAccountVerificationRequest request = new BankAccountVerificationRequest();
//         HttpEntity<MultiValueMap<String, String>> expectedHttpEntity = new HttpEntity<>(new LinkedMultiValueMap<>(), new HttpHeaders());
//         when(accountService.getRequestParameters(request)).thenReturn(expectedHttpEntity);

//         // Mocking the exchange() method
//         String expectedResponseBody = "Success response";
//         ResponseEntity<String> expectedResponseEntity = new ResponseEntity<>(expectedResponseBody, HttpStatus.OK);
//         when(restTemplate.exchange(anyString(), eq(HttpMethod.POST), eq(expectedHttpEntity), eq(String.class))).thenReturn(expectedResponseEntity);

//         // Calling the actual method
//         ResponseEntity<String> actualResponseEntity = (ResponseEntity<String>) accountService.getRequestParameters(request);

//         // Asserting the results
//         assertEquals(HttpStatus.OK, actualResponseEntity.getStatusCode());
//         assertEquals(expectedResponseBody, actualResponseEntity.getBody());

//         // Verifying that getRequestParameters() and exchange() were called with the expected arguments
//         verify(accountService, times(1)).getRequestParameters(request);
//         verify(restTemplate, times(1)).exchange(anyString(), eq(HttpMethod.POST), eq(expectedHttpEntity), eq(String.class));
// 	}

 }

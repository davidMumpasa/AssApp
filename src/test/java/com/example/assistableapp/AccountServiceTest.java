 package com.example.assistableapp;

// import com.example.assistableapp.bussinessLogic.AccountService;
// import com.example.assistableapp.controller.AssistableController;
// import com.example.assistableapp.entities.BankAccountVerificationRequest;
 import org.junit.jupiter.api.Test;
 import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.http.*;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.MvcResult;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

// import org.springframework.util.LinkedMultiValueMap;
// import org.springframework.util.MultiValueMap;
// import org.springframework.web.client.HttpClientErrorException;
// import org.springframework.web.client.RestTemplate;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.*;

 @SpringBootTest
// @AutoConfigureMockMvc
 class AccountServiceTest {
//     @Autowired
//     private AccountService accountService;

//     @MockBean
//     private RestTemplate restTemplate;

//     @Autowired
//     private AssistableController controller;

//     @Autowired
//     private MockMvc mockMvc;

//     @Test
//     void verifyBankAccount_Success() throws Exception {
//         // Mocking the getRequestParameters() method
//         BankAccountVerificationRequest request = new BankAccountVerificationRequest();
//         HttpEntity<MultiValueMap<String, String>> expectedHttpEntity = new HttpEntity<>(new LinkedMultiValueMap<>(), new HttpHeaders());
//         when(accountService.getRequestParameters(request)).thenReturn(expectedHttpEntity);

//         // Mocking the exchange() method
//         String expectedResponseBody = "Success response";
//         ResponseEntity<String> expectedResponseEntity = new ResponseEntity<>(expectedResponseBody, HttpStatus.OK);
//         when(restTemplate.exchange(accountService.getUrl(), HttpMethod.POST, expectedHttpEntity, String.class))
//                 .thenReturn(expectedResponseEntity);

//         // Calling the API endpoint using MockMvc
//         MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/bank-account-verification")
//                         .contentType(MediaType.APPLICATION_JSON)
//                         .content("{ \"memberKey\": \"key\", \"password\": \"password\", \"accountNumber\": \"123456789\", \"idNumber\": 123456789, \"accountType\": \"Savings\", \"branchCode\": \"1234\", \"yourReference\": \"ref\" }"))
//                 .andReturn();

//         // Asserting the HTTP response status and body
//         assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
//         assertEquals(expectedResponseBody, result.getResponse().getContentAsString());

//         // Verifying that getRequestParameters() and exchange() were called with the expected arguments
//         verify(accountService, times(1)).getRequestParameters(request);
//         verify(restTemplate, times(1)).exchange(accountService.getUrl(), HttpMethod.POST, expectedHttpEntity, String.class);
//     }

//     @Test
//     void verifyBankAccount_Unauthorized() throws Exception {
//         // Mocking the getRequestParameters() method
//         BankAccountVerificationRequest request = new BankAccountVerificationRequest();
//         HttpEntity<MultiValueMap<String, String>> expectedHttpEntity = new HttpEntity<>(new LinkedMultiValueMap<>(), new HttpHeaders());
//         when(accountService.getRequestParameters(request)).thenReturn(expectedHttpEntity);

//         // Mocking the HttpClientErrorException with UNAUTHORIZED status
//         when(restTemplate.exchange(accountService.getUrl(), HttpMethod.POST, expectedHttpEntity, String.class))
//                 .thenThrow(new HttpClientErrorException(HttpStatus.UNAUTHORIZED));

//         // Calling the API endpoint using MockMvc
//         MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/bank-account-verification")
//                         .contentType(MediaType.APPLICATION_JSON)
//                         .content("{ \"memberKey\": \"key\", \"password\": \"password\", \"accountNumber\": \"123456789\", \"idNumber\": 123456789, \"accountType\": \"Savings\", \"branchCode\": \"1234\", \"yourReference\": \"ref\" }"))
//                 .andReturn();

//         // Asserting the HTTP response status and body
//         assertEquals(HttpStatus.UNAUTHORIZED.value(), result.getResponse().getStatus());
//         assertEquals(accountService.getErrorMessage(), result.getResponse().getContentAsString());
//     }
}
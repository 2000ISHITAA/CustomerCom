package com.mjk.complaint.service;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mjk.complaint.entity.Conversation;
import com.mjk.complaint.repository.ConversationRepository;
@SpringBootTest
class ConversationServiceImplementationTest {
    @Mock
	ConversationRepository conversationRepository;
    @InjectMocks
    ConversationServiceImplementation conversationService;
	@Test
	void testInsertConversation() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllConversations() {
		fail("Not yet implemented");
	}

	@Test
	void testGetConversationByIssueId() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteConversation() {
		fail("Not yet implemented");
	}

	@Test
	void testGetConversationByTitle() {
		fail("Not yet implemented");
	}

	@Test
	void testGetConversationByDescription() {
		fail("Not yet implemented");
	}

	@Test
	void testGetConversationByPostingDate() {
		fail("Not yet implemented");
	}

	@Test
	void testGetConversationByUserName() {
		fail("Not yet implemented");
		
	}
	@Test
	void testDelete() {
	fail("Not yet implemented");
	}

	@Test
	//@Disabled
	    @DisplayName("Get all users by conversation id")
	void testGetConversationByConversationId() throws Exception {
	Conversation sampleOutput = new Conversation(2, "bad", "waste for money", "anny", "3-1-22");
	sampleOutput.setConversationId(1);

	int sampleInput = 1;

	Object conversationService;
	
	BDDMockito.given( conversationService.getConversationByConversationId(sampleOutput)).willReturn(sampleOutput);

	// when
	Conversation actualOutput = conversationService.getConversationByConversationId(sampleOutput);
	// verify
	assertEquals(sampleOutput, actualOutput);
	assertSame(sampleOutput.getIssueId(), actualOutput.getIssueId());
	assertThat(actualOutput.getIssueId()).isGreaterThan(0);

	}

	@Test
	void testGetAllConversations1() {
	fail("Not yet implemented");
	}

	}





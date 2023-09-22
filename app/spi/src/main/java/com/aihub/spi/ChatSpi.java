package com.aihub.spi;

import com.aihub.spi.domain.chat.ChatRequest;
import com.aihub.spi.domain.chat.ChatResult;

public interface ChatSpi extends AigcSpi {
    ChatResult send(ChatRequest request);
}

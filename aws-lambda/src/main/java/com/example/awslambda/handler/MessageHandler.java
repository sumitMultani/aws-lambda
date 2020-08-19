package com.example.awslambda.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MessageHandler implements RequestHandler<Integer, String> {

	@Override
	public String handleRequest(Integer event, Context context) {
		LambdaLogger logger = context.getLogger();
		logger.log("EVENT Count: " + event.toString());
		return event.toString();
	}

	public String getMessage() {
		return "getting response from Aws Api gateway.";
	}
}
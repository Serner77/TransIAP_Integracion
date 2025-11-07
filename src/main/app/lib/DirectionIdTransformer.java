package lib;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import java.util.UUID;

public class DirectionIdTransformer extends AbstractMessageTransformer {
    
    @Override
    public Object transformMessage(MuleMessage message, String outputEncoding) 
            throws TransformerException {
        
        String directionId = UUID.randomUUID().toString();
        
        message.setInvocationProperty("generatedDirectionId", directionId);

        System.out.println("Generated Direction ID: " + directionId);
        
        return message;
    }
}
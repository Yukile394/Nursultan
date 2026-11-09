package minecraft;

import com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

public record class00573(String message, Instant timeStamp, long salt, class04469 signature, class03058 lastSeenMessages) implements class00381<class08051> {
   public static final class02362<class00667, class00573> N = class00381.N(class00573::N, class00573::new);

   public long L() {
      return this.salt;
   }

   public class03058 M() {
      return this.lastSeenMessages;
   }

   private class00573(class00667 var1) {
      this(var1.u(256), var1.j(), var1.readLong(), var1.L(class04469::N), new class03058(var1));
   }

   public class00573(String message, Instant timeStamp, long salt, @Nullable class04469 signature, class03058 lastSeenMessages) {
      this.message = message;
      this.timeStamp = timeStamp;
      this.salt = salt;
      this.signature = signature;
      this.lastSeenMessages = lastSeenMessages;
   }

   @Nullable
   public class04469 u() {
      return this.signature;
   }

   public Instant y() {
      return this.timeStamp;
   }

   private int N(int var1) {
      return MaxChatLength.getChatLength();
   }

   private void N(class00667 var1) {
      var1.N(this.message, this.N(256));
      var1.N(this.timeStamp);
      var1.writeLong(this.salt);
      var1.N(this.signature, class04469::N);
      this.lastSeenMessages.N(var1);
   }

   public void method_65081(class08051 var1) {
      var1.method_12048(this);
   }

   public String N() {
      return this.message;
   }

   @Override
   public class02897<class00573> method_65080() {
      return class04248.yd;
   }
}

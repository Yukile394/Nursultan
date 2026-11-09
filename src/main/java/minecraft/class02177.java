package minecraft;

import java.time.Instant;

public record class02177(String command, Instant timeStamp, long salt, class04455 argumentSignatures, class03058 lastSeenMessages)
   implements class00381<class08051> {
   public static final class02362<class00667, class02177> N = class00381.N(class02177::N, class02177::new);

   public long L() {
      return this.salt;
   }

   public class03058 M() {
      return this.lastSeenMessages;
   }

   private class02177(class00667 var1) {
      this(var1.s(), var1.j(), var1.readLong(), new class04455(var1), new class03058(var1));
   }

   public class02177(String command, Instant timeStamp, long salt, class04455 argumentSignatures, class03058 lastSeenMessages) {
      super();
      this.command = command;
      this.timeStamp = timeStamp;
      this.salt = salt;
      this.argumentSignatures = argumentSignatures;
      this.lastSeenMessages = lastSeenMessages;
   }

   public class04455 u() {
      return this.argumentSignatures;
   }

   public Instant y() {
      return this.timeStamp;
   }

   private void N(class00667 var1) {
      var1.N(this.command);
      var1.N(this.timeStamp);
      var1.writeLong(this.salt);
      this.argumentSignatures.N(var1);
      this.lastSeenMessages.N(var1);
   }

   public void method_65081(class08051 var1) {
      var1.method_58580(this);
   }

   public String N() {
      return this.command;
   }

   @Override
   public class02897<class02177> method_65080() {
      return class04248.yl;
   }
}

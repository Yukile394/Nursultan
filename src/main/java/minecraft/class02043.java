package minecraft;

public record class02043(class00392 message) {
   public static final class02043 N = new class02043(class00392.L("gui.abuseReport.send.no_reason"));
   public static final class02043 y = new class02043(class00392.L("gui.chatReport.send.no_reported_messages"));
   public static final class02043 L = new class02043(class00392.L("gui.chatReport.send.too_many_messages"));
   public static final class02043 u = new class02043(class00392.L("gui.abuseReport.send.comment_too_long"));
   public static final class02043 i = new class02043(class00392.L("gui.abuseReport.send.not_attested"));

   public class02043(class00392 message) {
      super();
      this.message = message;
   }

   public class00392 y() {
      return this.message;
   }

   public class04141 N() {
      return class04141.N(this.message);
   }
}

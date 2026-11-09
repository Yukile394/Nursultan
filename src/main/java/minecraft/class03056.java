package minecraft;

import java.time.Instant;
import java.util.Optional;

public record class03056(String content, Instant timeStamp, long salt, class03066 lastSeen) {
   public long L() {
      return this.salt;
   }

   public class03056(class00667 var1) {
      this(var1.u(256), var1.j(), var1.readLong(), new class03066(var1));
   }

   public class03056(String content, Instant timeStamp, long salt, class03066 lastSeen) {
      super();
      this.content = content;
      this.timeStamp = timeStamp;
      this.salt = salt;
      this.lastSeen = lastSeen;
   }

   public class03066 u() {
      return this.lastSeen;
   }

   public Instant y() {
      return this.timeStamp;
   }

   public Optional<class03079> N(class03397 var1) {
      return this.lastSeen.N(var1).map(var1x -> new class03079(this.content, this.timeStamp, this.salt, var1x));
   }

   public void N(class00667 var1) {
      var1.N(this.content, 256);
      var1.N(this.timeStamp);
      var1.writeLong(this.salt);
      this.lastSeen.N(var1);
   }

   public String N() {
      return this.content;
   }
}

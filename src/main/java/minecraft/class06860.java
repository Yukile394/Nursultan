package minecraft;

import com.google.common.hash.HashCode;

record class06860(String name, byte[] payload, HashCode hash) {

   public HashCode L() {
      return this.hash;
   }

   class06860(String name, byte[] payload, HashCode hash) {
      this.name = name;
      this.payload = payload;
      this.hash = hash;
   }

   public byte[] y() {
      return this.payload;
   }

   public String N() {
      return this.name;
   }
}

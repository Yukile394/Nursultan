package minecraft;

import com.google.common.hash.HashFunction;
import java.net.Proxy;
import java.util.Map;

public record class01797(HashFunction hashFunction, int maxSize, Map<String, String> headers, Proxy proxy, class05007 listener) {

   public Map<String, String> L() {
      return this.headers;
   }

   public class01797(HashFunction hashFunction, int maxSize, Map<String, String> headers, Proxy proxy, class05007 listener) {
      super();
      this.hashFunction = hashFunction;
      this.maxSize = maxSize;
      this.headers = headers;
      this.proxy = proxy;
      this.listener = listener;
   }

   public class05007 i() {
      return this.listener;
   }

   public Proxy u() {
      return this.proxy;
   }

   public int y() {
      return this.maxSize;
   }

   public HashFunction N() {
      return this.hashFunction;
   }
}

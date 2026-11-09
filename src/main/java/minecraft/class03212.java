package minecraft;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;

class class03212 implements Iterator<RecordedEvent> {
   class03212(RecordingFile var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean hasNext() {
      return this.N.hasMoreEvents();
   }

   public RecordedEvent next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         try {
            return this.N.readEvent();
         } catch (IOException ioexception) {
            throw new UncheckedIOException(ioexception);
         }
      }
   }
}

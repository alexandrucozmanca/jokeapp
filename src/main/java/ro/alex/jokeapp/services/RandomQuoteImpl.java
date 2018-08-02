package ro.alex.jokeapp.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteImpl implements JokeService
{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public RandomQuoteImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

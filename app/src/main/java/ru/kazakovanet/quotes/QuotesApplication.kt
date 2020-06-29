package ru.kazakovanet.quotes

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton
import ru.kazakovanet.quotes.data.db.Database
import ru.kazakovanet.quotes.data.db.DatabaseFakeImpl
import ru.kazakovanet.quotes.data.db.QuoteDao
import ru.kazakovanet.quotes.data.repository.QuoteRepository
import ru.kazakovanet.quotes.data.repository.QuoteRepositoryImpl
import ru.kazakovanet.quotes.ui.quotes.QuotesViewModelFactory

/**
 * Created by NKazakova on 29.06.2020.
 */
class QuotesApplication : Application(), KodeinAware {

    override val kodein: Kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        bind<QuotesViewModelFactory>() with provider { QuotesViewModelFactory(instance()) }
//        bind() from provider { QuotesViewModelFactory(instance()) }
    }
}
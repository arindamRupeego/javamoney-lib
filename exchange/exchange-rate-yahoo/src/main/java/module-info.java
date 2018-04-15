import org.javamoney.moneta.convert.internal.yahoo.YahooRateProvider;

/*
 * CREDIT SUISSE IS WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE CONDITION THAT YOU
 * ACCEPT ALL OF THE TERMS CONTAINED IN THIS AGREEMENT. PLEASE READ THE TERMS AND CONDITIONS OF THIS
 * AGREEMENT CAREFULLY. BY DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF
 * THE AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY IT, SELECT THE "DECLINE" BUTTON AT THE
 * BOTTOM OF THIS PAGE. Specification: JSR-354 Money and Currency API ("Specification") Copyright
 * (c) 2012-2013, Credit Suisse All rights reserved.
 */
module org.javamoney.moneta.convert.yahoo {
    requires java.xml;
    requires java.xml.bind;
    requires org.javamoney.moneta;
    requires org.javamoney.moneta.convert;
    requires static org.osgi.core;
    requires static org.osgi.compendium;
    requires static org.osgi.annotation;
    provides javax.money.convert.ExchangeRateProvider with
            YahooRateProvider;
    uses org.javamoney.moneta.spi.LoaderService;
    uses org.javamoney.moneta.spi.MonetaryAmountProducer;

}
package de.visaq.controller;

import org.json.JSONObject;
import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.visaq.model.sensorthings.Datastream;
import de.visaq.model.sensorthings.FeatureOfInterest;
import de.visaq.model.sensorthings.HistoricalLocation;
import de.visaq.model.sensorthings.Location;
import de.visaq.model.sensorthings.Observation;
import de.visaq.model.sensorthings.ObservedProperty;
import de.visaq.model.sensorthings.Sensor;
import de.visaq.model.sensorthings.Thing;

@RunWith(Suite.class)
@SuiteClasses({ DatastreamControllerTest.class, FeatureOfInterestControllerTest.class,
        HistoricalLocationControllerTest.class, LocationControllerTest.class,
        ObservationControllerTest.class, ObservedPropertyControllerTest.class,
        SensorControllerTest.class, ThingControllerTest.class })
public class SensorthingsControllerTests {
    public static HistoricalLocation ALIVEHISTORICALLOCATION;
    public static Location ALIVELOCATION;
    public static Sensor ALIVESENSOR;
    public static ObservedProperty ALIVEOBSERVEDPROPERTY;
    public static Thing ALIVETHING;
    public static Datastream ALIVEDATASTREAM;
    public static FeatureOfInterest ALIVEFEATUREOFINTEREST;
    public static Observation ALIVEOBSERVATION;

    @ClassRule
    public static ExternalResource testRule = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            ALIVEDATASTREAM = new DatastreamController().singleBuild(new JSONObject("{\r\n"
                    + "  \"name\" : \"PM2.5 Datastream of Crowdsensing Node (SDS011, 179552)\",\r\n"
                    + "  \"description\" : \"Datastream for recording Particulate Matter\",\r\n"
                    + "  \"properties\" : {\r\n" + "    \"license\" : {\r\n"
                    + "      \"type\" : \"CC0 1.0\",\r\n" + "      \"owner\" : \"TECO\",\r\n"
                    + "      \"metadata\" : \"https://creativecommons.org/publicdomain/zero/1.0/deed.de\"\r\n"
                    + "    }\r\n" + "  },\r\n"
                    + "  \"observationType\" : \"http://www.opengis.net/def/observationType/OGC-OM/2.0/OM_Measurement\",\r\n"
                    + "  \"observedArea\" : {\r\n" + "    \"type\" : \"Point\",\r\n"
                    + "    \"coordinates\" : [ 8.4158, 49.01262 ]\r\n" + "  },\r\n"
                    + "  \"phenomenonTime\" : \"2019-07-02T15:23:52.000Z/2019-09-20T14:17:17.000Z\",\r\n"
                    + "  \"resultTime\" : \"2019-07-02T15:23:52.000Z/2019-09-20T14:17:17.000Z\",\r\n"
                    + "  \"Sensor@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Datastreams('saqn%3Ads%3A7540858')/Sensor\",\r\n"
                    + "  \"Thing@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Datastreams('saqn%3Ads%3A7540858')/Thing\",\r\n"
                    + "  \"Observations@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Datastreams('saqn%3Ads%3A7540858')/Observations\",\r\n"
                    + "  \"unitOfMeasurement\" : {\r\n"
                    + "    \"name\" : \"microgram per cubic meter\",\r\n"
                    + "    \"symbol\" : \"ug/m^3\",\r\n"
                    + "    \"definition\" : \"http://www.qudt.org/qudt/owl/1.0.0/unit/Instances.html#KilogramPerCubicMeter\"\r\n"
                    + "  },\r\n"
                    + "  \"ObservedProperty@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Datastreams('saqn%3Ads%3A7540858')/ObservedProperty\",\r\n"
                    + "  \"@iot.id\" : \"saqn:ds:7540858\",\r\n"
                    + "  \"@iot.selfLink\" : \"https://api.smartaq.net/v1.0/Datastreams('saqn%3Ads%3A7540858')\"\r\n"
                    + "}"));

            ALIVEFEATUREOFINTEREST = new FeatureOfInterestController().singleBuild(new JSONObject(
                    "{\r\n" + "  \"name\" : \"FoI for location geo:49.012615,8.415800,nan\",\r\n"
                            + "  \"description\" : \"Generated from location geo:49.012615,8.415800,nan\",\r\n"
                            + "  \"encodingType\" : \"application/vnd.geo+json\",\r\n"
                            + "  \"feature\" : {\"type\":\"Point\",\"coordinates\":[8.4158,49.01262]},\r\n"
                            + "  \"Observations@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/FeaturesOfInterest('683361ca-9cdd-11e9-a024-63792331b2bf')/Observations\",\r\n"
                            + "  \"@iot.id\" : \"683361ca-9cdd-11e9-a024-63792331b2bf\",\r\n"
                            + "  \"@iot.selfLink\" : \"https://api.smartaq.net/v1.0/FeaturesOfInterest('683361ca-9cdd-11e9-a024-63792331b2bf')\"\r\n"
                            + "}"));

            ALIVEHISTORICALLOCATION = new HistoricalLocationController().singleBuild(
                    new JSONObject("{\r\n" + "  \"time\" : \"2019-07-02T15:23:53.749Z\",\r\n"
                            + "  \"Thing@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/HistoricalLocations('66c68826-9cdd-11e9-a024-ffbd2647ca86')/Thing\",\r\n"
                            + "  \"Locations@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/HistoricalLocations('66c68826-9cdd-11e9-a024-ffbd2647ca86')/Locations\",\r\n"
                            + "  \"@iot.id\" : \"66c68826-9cdd-11e9-a024-ffbd2647ca86\",\r\n"
                            + "  \"@iot.selfLink\" : \"https://api.smartaq.net/v1.0/HistoricalLocations('66c68826-9cdd-11e9-a024-ffbd2647ca86')\"\r\n"
                            + "}"));

            ALIVELOCATION = new LocationController().singleBuild(new JSONObject("{\r\n"
                    + "  \"name\" : \"\",\r\n" + "  \"description\" : \"\",\r\n"
                    + "  \"encodingType\" : \"application/vnd.geo+json\",\r\n"
                    + "  \"location\" : {\"type\":\"Point\",\"coordinates\":[8.4158,49.01262]},\r\n"
                    + "  \"HistoricalLocations@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Locations('geo%3A49.012615%2C8.415800%2Cnan')/HistoricalLocations\",\r\n"
                    + "  \"Things@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Locations('geo%3A49.012615%2C8.415800%2Cnan')/Things\",\r\n"
                    + "  \"@iot.id\" : \"geo:49.012615,8.415800,nan\",\r\n"
                    + "  \"@iot.selfLink\" : \"https://api.smartaq.net/v1.0/Locations('geo%3A49.012615%2C8.415800%2Cnan')\"\r\n"
                    + "}"));

            ALIVEOBSERVATION = new ObservationController().singleBuild(new JSONObject("{\r\n"
                    + "  \"@iot.nextLink\" : \"https://api.smartaq.net/v1.0/Datastreams('saqn%3Ads%3A7540858')/Observations?$top=1&$skip=1\",\r\n"
                    + "  \"value\" : [ {\r\n"
                    + "    \"phenomenonTime\" : \"2019-08-27T23:10:46.000Z\",\r\n"
                    + "    \"resultTime\" : \"2019-08-27T23:10:46.000Z\",\r\n"
                    + "    \"result\" : 2,\r\n"
                    + "    \"Datastream@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Observations('073bd720-a210-11e9-b7ed-bbb7a24d894a')/Datastream\",\r\n"
                    + "    \"FeatureOfInterest@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Observations('073bd720-a210-11e9-b7ed-bbb7a24d894a')/FeatureOfInterest\",\r\n"
                    + "    \"@iot.id\" : \"073bd720-a210-11e9-b7ed-bbb7a24d894a\",\r\n"
                    + "    \"@iot.selfLink\" : \"https://api.smartaq.net/v1.0/Observations('073bd720-a210-11e9-b7ed-bbb7a24d894a')\"\r\n"
                    + "  } ]\r\n" + "}"));

            ALIVEOBSERVEDPROPERTY = new ObservedPropertyController().singleBuild(
                    new JSONObject("{\r\n" + "  \"name\" : \"PM2.5 Mass Concentration\",\r\n"
                            + "  \"description\" : \"Mass concentration of Particulate Matter with a diameter of equal or less than 2.5 micrometers in air.\",\r\n"
                            + "  \"properties\" : {\r\n" + "    \"conventions\" : {\r\n"
                            + "      \"unitOfMeasurement\" : {\r\n"
                            + "        \"name\" : \"microgram per cubic meter\",\r\n"
                            + "        \"symbol\" : \"ug/m3\",\r\n"
                            + "        \"definition\" : \"http://unitsofmeasure.org/ucum.html\"\r\n"
                            + "      },\r\n" + "      \"fixedPoints\" : {\r\n"
                            + "        \"0\" : \"#0f8a0f\",\r\n"
                            + "        \"5\" : \"#2db00c\",\r\n"
                            + "        \"10\" : \"#59d408\",\r\n"
                            + "        \"15\" : \"#8fec04\",\r\n"
                            + "        \"20\" : \"#c7f901\",\r\n"
                            + "        \"25\" : \"#ffff00\",\r\n"
                            + "        \"30\" : \"#f9c701\",\r\n"
                            + "        \"40\" : \"#ec8f04\",\r\n"
                            + "        \"50\" : \"#d45908\",\r\n"
                            + "        \"100\" : \"#b02d0c\",\r\n"
                            + "        \"2147483647\" : \"#8a0f0f\"\r\n" + "      }\r\n"
                            + "    },\r\n" + "    \"shortname\" : \"mcpm2p5\",\r\n"
                            + "    \"shortname.definition\" : \"http://www.uc2-program.org/uc2_table_A1.pdf\"\r\n"
                            + "  },\r\n"
                            + "  \"Datastreams@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/ObservedProperties('saqn%3Aop%3Amcpm2p5')/Datastreams\",\r\n"
                            + "  \"MultiDatastreams@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/ObservedProperties('saqn%3Aop%3Amcpm2p5')/MultiDatastreams\",\r\n"
                            + "  \"definition\" : \"http://cfconventions.org/Data/cf-standard-names/63/build/cf-standard-name-table.html#mass_concentration_of_pm2p5_ambient_aerosol_particles_in_air\",\r\n"
                            + "  \"@iot.id\" : \"saqn:op:mcpm2p5\",\r\n"
                            + "  \"@iot.selfLink\" : \"https://api.smartaq.net/v1.0/ObservedProperties('saqn%3Aop%3Amcpm2p5')\"\r\n"
                            + "}"));

            ALIVESENSOR = new SensorController().singleBuild(new JSONObject("{\r\n"
                    + "  \"name\" : \"Nova SDS011\",\r\n"
                    + "  \"description\" : \"A low-cost sensor measuring particulate matter\",\r\n"
                    + "  \"properties\" : {\r\n"
                    + "    \"datasheet.url\" : \"https://web.archive.org/web/20191111144451/https://www.watterott.com/media/files_public/fwyjbmbnj/SDS01.pdf\",\r\n"
                    + "    \"shortname\" : \"sds011\",\r\n"
                    + "    \"manufacturer.domain\" : \"inovafitness.com\"\r\n" + "  },\r\n"
                    + "  \"Datastreams@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Sensors('saqn%3As%3Ab3dd2c9')/Datastreams\",\r\n"
                    + "  \"MultiDatastreams@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Sensors('saqn%3As%3Ab3dd2c9')/MultiDatastreams\",\r\n"
                    + "  \"encodingType\" : \"application/json\",\r\n"
                    + "  \"metadata\" : \"https://api.smartaq.net/v1.0/Sensors('saqn%3As%3Ab3dd2c9')/properties\",\r\n"
                    + "  \"@iot.id\" : \"saqn:s:b3dd2c9\",\r\n"
                    + "  \"@iot.selfLink\" : \"https://api.smartaq.net/v1.0/Sensors('saqn%3As%3Ab3dd2c9')\"\r\n"
                    + "}"));

            ALIVETHING = new ThingController().singleBuild(new JSONObject("{\r\n"
                    + "  \"name\" : \"Scientific Scout EDM80 NEPH SN17017\",\r\n"
                    + "  \"description\" : \"Mid Cost Device Measuring Particulate Matter\",\r\n"
                    + "  \"properties\" : {\r\n"
                    + "    \"operator.domain\" : \"grimm-aerosol.com\",\r\n"
                    + "    \"shortname\" : \"edm80neph\",\r\n"
                    + "    \"hardware.id\" : \"sn17017\"\r\n" + "  },\r\n"
                    + "  \"Datastreams@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Things('saqn%3At%3Agrimm-aerosol.com%3AEDM80NEPH%3ASN17017')/Datastreams\",\r\n"
                    + "  \"MultiDatastreams@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Things('saqn%3At%3Agrimm-aerosol.com%3AEDM80NEPH%3ASN17017')/MultiDatastreams\",\r\n"
                    + "  \"Locations@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Things('saqn%3At%3Agrimm-aerosol.com%3AEDM80NEPH%3ASN17017')/Locations\",\r\n"
                    + "  \"HistoricalLocations@iot.navigationLink\" : \"https://api.smartaq.net/v1.0/Things('saqn%3At%3Agrimm-aerosol.com%3AEDM80NEPH%3ASN17017')/HistoricalLocations\",\r\n"
                    + "  \"@iot.id\" : \"saqn:t:grimm-aerosol.com:EDM80NEPH:SN17017\",\r\n"
                    + "  \"@iot.selfLink\" : \"https://api.smartaq.net/v1.0/Things('saqn%3At%3Agrimm-aerosol.com%3AEDM80NEPH%3ASN17017')\"\r\n"
                    + "}"));
        };
    };

}

<h2>Spring Kafka</h2>
Spring Kafka is a Spring Boot application that makes it easy to create Kafka-based messaging systems. It provides a high-level abstraction for sending and receiving messages from Kafka topics.
<br>
<br>
<h3>Prerequisites</h3>
<li>Java 8 or later</li>
<li>Apache Kafka 0.11 or later</li>
<li>Spring Boot 2.3 or later</li>
<br>
<br>
<h3>Configuration</h3>
Once the dependency is added, you can configure your Kafka connections in the application properties file. The following properties are required:
<li style="margin-top: 10px">'<b>spring.kafka.bootstrap-servers</b>': A comma-separated list of host:port pairs to use for establishing the initial connections to the Kafka cluster.</li>
<li>'<b>spring.kafka.producer.key-serializer</b>': The serializer class for the key of the message.</li>
<li style="margin-bottom: 10px">'<b>spring.kafka.producer.value-serializer</b>': The serializer class for the value of the message.</li>
You can also configure other properties such as spring.kafka.consumer.group-id for consumer groups.
<br>
<br>
<h3>Usage</h3>
You can use the <code>KafkaTemplate</code> class to send messages to a topic, and the <code>@KafkaListener</code> annotation to receive messages from a topic.
<br>
<br>
Here is an example of sending a message to a topic:

<pre>
<code>
@Autowired
private KafkaTemplate&#60String String&#62 kafkaTemplate;

public void sendMessage(String topic, String message) {
    kafkaTemplate.send(topic, message);
}
</code>
</pre>
<br>
And here is an example of receiving messages from a topic:
<br>
<pre>
<code>
@KafkaListener(topics = "myTopic")
public void listen(String message) {
    // Do something with the message
}
</code>
</pre>
<br>
You can also use the @KafkaListener annotation on a method that takes a ConsumerRecord as an argument to access more information about the message, such as the topic and partition.
<br>
<br>
<h3>Conclusion</h3>
Spring Kafka makes it easy to create Kafka-based messaging systems using Spring Boot. By using the <code>KafkaTemplate</code> and <code>@KafkaListener</code> annotations, you can send and receive messages from Kafka topics with minimal configuration.
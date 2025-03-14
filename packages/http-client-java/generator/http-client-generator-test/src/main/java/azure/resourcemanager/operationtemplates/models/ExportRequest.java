// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package azure.resourcemanager.operationtemplates.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ExportRequest model.
 */
@Fluent
public final class ExportRequest implements JsonSerializable<ExportRequest> {
    /*
     * Format of the exported order.
     */
    private String format;

    /**
     * Creates an instance of ExportRequest class.
     */
    public ExportRequest() {
    }

    /**
     * Get the format property: Format of the exported order.
     * 
     * @return the format value.
     */
    public String format() {
        return this.format;
    }

    /**
     * Set the format property: Format of the exported order.
     * 
     * @param format the format value to set.
     * @return the ExportRequest object itself.
     */
    public ExportRequest withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (format() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property format in model ExportRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExportRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("format", this.format);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExportRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExportRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExportRequest.
     */
    public static ExportRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExportRequest deserializedExportRequest = new ExportRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("format".equals(fieldName)) {
                    deserializedExportRequest.format = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExportRequest;
        });
    }
}

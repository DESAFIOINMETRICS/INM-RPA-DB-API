using Newtonsoft.Json;
using Newtonsoft.Json.Serialization;

// Informacoes retiradas da API
namespace ProjetoInMetrics
{
    public class InfoApi
    {
        [JsonProperty("nome")]
        public string NomeEmpresa { get; set; }
        [JsonProperty("situacao")]
        public string Situacao { get; set; }
        [JsonProperty("bairro")]
        public string Bairro { get; set; }
        [JsonProperty("logradouro")]
        public string Logradouro { get; set; }
        [JsonProperty("numero")]
        public string Numero { get; set; }
        [JsonProperty("cep")]
        public string Cep { get; set; }
        [JsonProperty("telefone")]
        public string Telefone { get; set; }
        [JsonProperty("email")]
        public string  Email { get; set; }
    }
}

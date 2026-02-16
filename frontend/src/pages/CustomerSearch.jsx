import { useState } from "react";
import { searchCustomer } from "../api/customerApi";
import CustomerCard from "../components/CustomerCard";
import Spinner from "../components/Spinner";
import ErrorMessage from "../components/ErrorMessage";
import "../styles/CustomerSearch.css";

export default function CustomerSearch() {

  const [typeId, setTypeId] = useState("");
  const [number, setNumber] = useState("");
  const [customer, setCustomer] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");

  const search = async () => {
    const cleanTypeId = typeId.trim();
    const cleanNumber = number.toString().trim();

    if (!cleanTypeId || !cleanNumber) {
      setError("Campos obligatorios");
      return;
    }

    setLoading(true);
    setError("");
    setCustomer(null);

    try {
      const data = await searchCustomer(cleanTypeId, cleanNumber);

      if (data.status && data.message) {
        setError(data.message);
        return;
      }

      setCustomer(data);
    } catch (err) {
      setError(err.message);
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="search-container">
      <input placeholder="Tipo Doc" onChange={e => setTypeId(e.target.value)} />
      <input
        type="number"
        placeholder="Número Doc"
        onChange={e => setNumber(e.target.value)}
      />
      <button onClick={search} disabled={loading}>
        Buscar
      </button>

      {loading && <Spinner />}
      {error && <ErrorMessage message={error} />}
      {customer && <CustomerCard customer={customer} />}
    </div>
  );
}